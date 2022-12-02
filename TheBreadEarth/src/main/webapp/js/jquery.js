$(function () {
    
    
    /* 마우스휠이벤트 */
    $('.wheelEvent').on('mousewheel', function (e) {
        e.preventDefault();
        let d = e.originalEvent.wheelDelta;
        // console.log(d);
        if (d > 0) {  //마우스휠 올릴 때
            try {
                let prev = $(this).prev().offset().top; //prev()는 형제에서 찾는거라 같은 선상에 있어야함.(html)
                // console.log(prev);

                $('html, body').stop().animate({ scrollTop: prev }, 1000);
            } catch (e) {
                return false;
            }
        } else { //마우스휠 내릴 때
            try {
                let next = $(this).next().offset().top;
                if (next == 0) {
                    return false;
                }
                $('html,body').stop().animate({ scrollTop: next }, 1500);
            } catch (e) {
                return false;
            }
        }
    });
    
    /*
   * ----------- ------------ ------------ 
   *               메인배너 
   * ------------ ------------ ------------
   */

    /* Slideshow */
    let currentIndex = 0;
    let slides = $(".banner>li");
    let pager = $('.pager>span');
    function fadeBanner() {
        pager.removeClass('active');
        pager.eq(currentIndex).addClass('active');

        slides.stop().animate({
            "opacity": 0
        }, 500);
        slides.eq(currentIndex).stop().animate({
            "opacity": 1
        }, 500);
    }

    function showNextSlide() {
        if (currentIndex >= slides.length - 1) {
            currentIndex = 0;
        }
        else {
            currentIndex++;
        }
        fadeBanner();
    }

    setInterval(showNextSlide, 3000);

    pager.on({
        click: function () {
            let tg = $(this);
            let i = tg.index();

            if (i == currentIndex) { return; }
            currentIndex = i;
            fadeBanner();
        }
    });



     /*
   * ----------- ------------ ------------ 
   *               본문  
   * ------------ ------------ ------------
   */
    
    
    let sNum = 0;  //현재보여지는 배너가 누구인지 체크
    let liWidth = $(".menuList>li").innerWidth();  //배너 하나의 너비값
    console.log(liWidth);

    let liCount = $(".menuList>li").length;  //복사전 배너의 개수
    //배너의 앞에서 두개를 복사하여 배너의 마지막에 붙이기
    let objFirst = $(".menuList>li").clone();
    $(".menuList").append(objFirst);    
    let copyCount = $(".menuList>li").length; //복사후의 li의 개수
    console.log(copyCount);

    let bannerWidth = 100 * copyCount / 4;  //부모의 너비
    $(".menuList").outerWidth(bannerWidth + "%");
    
    liWidth = $(".menuList").outerWidth()/(liCount*2);
    
    $(".menuList>li").outerWidth(liWidth);

    function moveBanner() {
        $(".menuList").stop().animate({
            "margin-left": -sNum * liWidth
        }, 1000)
        console.log(sNum)
    }

    //오른쪽 버튼을 클릭하면 배너 하나만큼 왼쪽으로 이동
    $(".next").on("click", function () {
        if (sNum >= liCount) {
            sNum = 0;
            $(".menuList").css("margin-left", sNum);
        }
        sNum++;
        moveBanner();
    })

    //오른쪽 버튼을 클릭하면 배너 하나만큼 오른쪽으로 이동
    $(".prev").on("click", function () {
        if (sNum <= 0) {
            sNum = liCount;
            $(".menuList").css("margin-left", -liWidth * liCount)
        }
        sNum--;
        moveBanner();
    })
 
     //3초마다 배너가 하나씩 왼쪽으로 이동
     let timer = setInterval(() => {
         $(".next").trigger("click");
     }, 3000);
   
     $(".menuListWrap").on({
        "mouseover":function(){
            clearInterval(timer);
        }
     })
    



}); //jquery닫음