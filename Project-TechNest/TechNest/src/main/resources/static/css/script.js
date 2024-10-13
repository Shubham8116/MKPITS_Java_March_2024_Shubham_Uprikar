$(document).ready(function() {
    // Slider for brand images
    let brandCurrentIndex = 0;
    const brandItems = $('.brand-slider-container img');
    const brandItemCount = brandItems.length;
    const brandItemWidth = brandItems.outerWidth(true); // Including margin

    function showBrandItems(index) {
        const offset = -index * brandItemWidth;
        $('.brand-slider-container').css('transform', 'translateX(' + offset + 'px)');
    }
function autoSlideBrands() {
        brandCurrentIndex = (brandCurrentIndex + 1) % brandItemCount;
        showBrandItems(brandCurrentIndex);
    }

    let brandSliderInterval = setInterval(autoSlideBrands, 1000); // Change slide every 3 seconds

    $('.next-brand').click(function() {
        clearInterval(brandSliderInterval);
        brandCurrentIndex = (brandCurrentIndex + 1) % brandItemCount;
        showBrandItems(brandCurrentIndex);
        brandSliderInterval = setInterval(autoSlideBrands, 3000);
    });

    $('.prev-brand').click(function() {
        clearInterval(brandSliderInterval);
        brandCurrentIndex = (brandCurrentIndex - 1 + brandItemCount) % brandItemCount;
        showBrandItems(brandCurrentIndex);
        brandSliderInterval = setInterval(autoSlideBrands, 3000);
    });
    // Slider for main images
    let mainCurrentIndex = 0;
    const mainImages = $('.slider-container img');
    const mainTotalImages = mainImages.length;

    function showMainImage(index) {
        const offset = -index * 100 + '%';
        $('.slider-container').css('transform', 'translateX(' + offset + ')');
    }

    function autoSlideMain() {
        mainCurrentIndex = (mainCurrentIndex + 1) % mainTotalImages;
        showMainImage(mainCurrentIndex);
    }

    let mainSliderInterval = setInterval(autoSlideMain, 3000); // Change slide every 3 seconds

    $('.next-main').click(function() {
        clearInterval(mainSliderInterval);
        mainCurrentIndex = (mainCurrentIndex + 1) % mainTotalImages;
        showMainImage(mainCurrentIndex);
        mainSliderInterval = setInterval(autoSlideMain, 3000);
    });

    $('.prev-main').click(function() {
        clearInterval(mainSliderInterval);
        mainCurrentIndex = (mainCurrentIndex - 1 + mainTotalImages) % mainTotalImages;
        showMainImage(mainCurrentIndex);
        mainSliderInterval = setInterval(autoSlideMain, 3000);
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


