window.onload = function () {  
/* 햄버거버튼 */
    let hamB = document.querySelector(".hamBtn");
    let xBtn = document.querySelector(".xBtn");
    let nav = document.querySelector("nav");
    let mNav = document.querySelector(".mobileNav");

    hamB.onclick = function () {
        // nav.style.display = "block";
        if (nav.style.display = "none") {
            nav.style.display = "block";
            mNav.style.display = "block";
            hamB.style.opacity = "none";
        } else {
            nav.style.display = "none";
            // mNav.style.display = "none"
            hamB.style.opacity = "block";
        }
    };
    xBtn.onclick = function () {
        if (nav.style.display = "block") {
            nav.style.display = "none"
            hamB.style.display = "block";
        } else {
            nav.style.display = "block";
        }
    };
    

// arrowUP버튼(맨 위로 이동) 
    let scrollTopBtn = document.querySelector('.arrowUp');
    
    scrollTopBtn.addEventListener('click',function(e){
        e.preventDefault();
        window.scrollTo({top: 0, behavior:'smooth'});
    });    
    
}


