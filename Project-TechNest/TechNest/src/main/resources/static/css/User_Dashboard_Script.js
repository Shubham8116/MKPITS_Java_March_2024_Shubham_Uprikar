// Function to show the selected section and hide the others
function showSection(sectionId) {
    const sections = document.querySelectorAll('.content-section');
    sections.forEach(section => {
        section.style.display = 'none';  // Hide all sections
    });
    document.getElementById(sectionId).style.display = 'block';  // Show the selected section

    // Update active state of sidebar links
    const links = document.querySelectorAll('.sidebar ul li a');
    links.forEach(link => {
        link.classList.remove('active');
    });
    event.target.classList.add('active');
}

// Show default section (My Orders) on page load
window.onload = function() {
    showSection('my-orders');
}