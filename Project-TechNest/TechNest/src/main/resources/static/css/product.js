// JavaScript to handle filter changes and update product list
$(document).ready(function() {
    $('input[name="brand"], input[name="screenSize"]').change(function() {
        // Fetch and display filtered products based on selected filters
        // Implement AJAX call to fetch filtered products
    });

    // Clock functionality
    function updateClock() {
        const now = new Date();
        const hours = now.getHours().toString().padStart(2, '0');
        const minutes = now.getMinutes().toString().padStart(2, '0');
        const seconds = now.getSeconds().toString().padStart(2, '0');
        $('#clock').text(`${hours}:${minutes}:${seconds}`);
    }

    setInterval(updateClock, 1000);
    updateClock();
});

document.addEventListener('DOMContentLoaded', function() {
    // Example: Fetch cart count from server or local storage
    let cartCount;
    cartCount = 2; // Replace with actual logic to get cart count

    // Update cart count in the DOM
    document.querySelector('.cart-count').textContent = cartCount;
});

document.addEventListener("DOMContentLoaded", function() {
    const priceElements = document.querySelectorAll('.discounted-price');
    priceElements.forEach(function(element) {
        const rawPrice = parseFloat(element.getAttribute('data-price'));
        const formattedPrice = rawPrice.toFixed(2);
        element.textContent = formattedPrice;
    });
});

document.querySelectorAll('.add-to-cart').forEach(button => {
    button.addEventListener('click', function() {
        this.classList.add('hidden');
    });
});