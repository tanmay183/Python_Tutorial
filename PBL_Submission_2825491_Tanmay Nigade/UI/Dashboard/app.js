const bookTicketForm = document.getElementById('bookTicketForm');
const viewTicketsTableBody = document.querySelector('#viewTicketsTable tbody');

let tickets = JSON.parse(localStorage.getItem('tickets')) || [];

bookTicketForm.addEventListener('submit', e => {
  e.preventDefault();

  const userName = document.getElementById('bookName').value.trim();
  const mobile = document.getElementById('bookMobile').value.trim();
  const age = parseInt(document.getElementById('bookAge').value, 10);
  const boardingDate = document.getElementById('bookDate').value;
  const boardingStation = document.getElementById('bookBoarding').value.trim();
  const destinationStation = document.getElementById('bookDestination').value.trim();
  const category = document.getElementById('bookCategory').value;
  const train = document.getElementById('bookTrain').value.trim();
  const numTickets = parseInt(document.getElementById('bookNumTickets').value, 10);

  if (!/^\d{10}$/.test(mobile)) {
    alert('Mobile number must be exactly 10 digits.');
    return;
  }
  if (age < 1 || age > 120) {
    alert('Please enter a valid age.');
    return;
  }
  if (new Date(boardingDate) < new Date().setHours(0,0,0,0)) {
    alert('Boarding date cannot be in the past.');
    return;
  }
  if (boardingStation.toLowerCase() === destinationStation.toLowerCase()) {
    alert('Boarding and destination stations must be different.');
    return;
  }
  if (numTickets < 1 || numTickets > 10) {
    alert('Tickets must be between 1 and 10.');
    return;
  }

  const ticketId = 'T' + Date.now();
  const boardingDateTime = new Date(boardingDate + 'T09:00:00');
  const arrivalDateTime = new Date(boardingDateTime.getTime() + 4 * 3600 * 1000);

  const ticket = {
    ticketId,
    trainId: train,
    userName,
    mobile,
    age,
    boardingStation,
    destinationStation,
    boardingDate: boardingDateTime.toISOString(),
    arrivalDate: arrivalDateTime.toISOString(),
    numTickets,
    category
  };

  tickets.push(ticket);
  localStorage.setItem('tickets', JSON.stringify(tickets));

  alert('Ticket booked successfully!');
  bookTicketForm.reset();
  renderTicketsTable();
});

function renderTicketsTable() {
  viewTicketsTableBody.innerHTML = '';

  if (tickets.length === 0) {
    viewTicketsTableBody.innerHTML = '<tr><td colspan="9">No tickets booked yet.</td></tr>';
    return;
  }

  tickets.forEach(t => {
    viewTicketsTableBody.innerHTML += `
      <tr>
        <td>${t.ticketId}</td>
        <td>${t.trainId}</td>
        <td>${t.userName}</td>
        <td>${t.boardingStation}</td>
        <td>${t.destinationStation}</td>
        <td>${new Date(t.boardingDate).toLocaleDateString()}</td>
        <td>${new Date(t.arrivalDate).toLocaleDateString()}</td>
        <td>${t.numTickets}</td>
        <td>${t.category}</td>
      </tr>
    `;
  });
}

// Render on page load
renderTicketsTable();
