var imagesArray = new Array();

imagesArray[0] = {
    image01 : new Image(),
    image01 : document.getElementById("bell"),
    value : 6

};

imagesArray[1] = {
    image01 : new Image(),
    image01 : document.getElementById("cherry"),
    value : 2

};

imagesArray[2] = {
    image01 : new Image(),
    image01 : document.getElementById("lemon"),
    value : 3

};

imagesArray[3] = {
    image01 : new Image(),
    image01 : document.getElementById("plum"),
    value : 4

};

imagesArray[4] = {
    image01 : new Image(),
    image01 : document.getElementById("redseven"),
    value : 7

};

imagesArray[5] = {
    image01 : new Image(),
    image01 : document.getElementById("watermelon"),
    value : 5

};

var refreshIntervalIdone;
var refreshIntervalIdTwo;
var refreshIntervalIdThree;
var indexReelOne;
var indexReelTwo;
var indexReelThree;
var betAmount = 0;
var totalCredits = 0;
var startCreditAmount = 10;
var totalWins  = 0;
var totalLoses = 0;


function shuffleArray( array ) {

    for (i = array.length - 1; i > 0; i--) {
        var j = parseInt(Math.random() * i)
        var tmp = array[i];
        array[i] = array[j]
        array[j] = tmp;
    }
    return array;
}

function myCanvas(canvas, i) {
    var c = document.getElementById(canvas);
    var ctx = c.getContext("2d");
    var img = imagesArray[parseInt(i)].image01;
    ctx.clearRect(0, 0, c.width, c.height);
    ctx.drawImage(img,40,30);
}

function reelOne() {
    indexReelOne = parseInt(Math.random()*imagesArray.length);
    myCanvas("canvas1", indexReelOne)
}

function reelTwo() {
    indexReelTwo = parseInt(Math.random()*imagesArray.length);
    myCanvas("canvas2", indexReelTwo)
}

function rellThree() {
    indexReelThree = parseInt(Math.random()*imagesArray.length);
    myCanvas("canvas3", indexReelThree)
}

function spin() {
    if(document.getElementById("betAmount").textContent == 0){
        alert("Please make a bet to start the game");
    }else{
        refreshIntervalIdone = setInterval(reelOne,60);
        refreshIntervalIdTwo = setInterval(reelTwo,60);
        refreshIntervalIdThree = setInterval(rellThree,60);
    }

}

function stop() {
    clearInterval(refreshIntervalIdone);
    clearInterval(refreshIntervalIdTwo);
    clearInterval(refreshIntervalIdThree);
    winamount();
    betAmount = 0;
    document.getElementById("betAmount").textContent = 0;
    document.getElementById("totalWins").textContent = totalWins;
}

function winamount(){
    var value = 0;
    if(indexReelOne === indexReelTwo && indexReelOne === indexReelThree){
        value = imagesArray[indexReelOne].value;
        document.getElementById("winAmount").textContent = value*betAmount;
        startCreditAmount = startCreditAmount + (value*betAmount);
        document.getElementById("creditAmount").textContent = startCreditAmount;
        totalWins++;
    }
    if(indexReelOne === indexReelTwo){
        value = imagesArray[indexReelOne].value;
        document.getElementById("winAmount").textContent = value*betAmount;
        startCreditAmount = startCreditAmount + (value*betAmount);
        document.getElementById("creditAmount").textContent = startCreditAmount;
        totalWins++;
    }
    if(indexReelOne === indexReelThree){
        value = imagesArray[indexReelOne].value;
        document.getElementById("winAmount").textContent = value*betAmount;
        startCreditAmount = startCreditAmount + (value*betAmount);
        document.getElementById("creditAmount").textContent = startCreditAmount;
        totalWins++;
    }
    if(indexReelTwo === indexReelThree){
        value = imagesArray[indexReelTwo].value;
        document.getElementById("winAmount").textContent = value*betAmount;
        startCreditAmount = startCreditAmount + (value*betAmount);
        document.getElementById("creditAmount").textContent = startCreditAmount;
        totalWins++;
    }
    if(indexReelOne !== indexReelTwo && indexReelOne !== indexReelThree && indexReelTwo !== indexReelThree){
        startCreditAmount = startCreditAmount - betAmount;
        document.getElementById("creditAmount").textContent = startCreditAmount;
        alert("You lost the bet");
        totalLoses++;
    }
    if(startCreditAmount === 0){
        alert("You are out of credit..Please Add coin to continue");
    }

}

function bet(){
    if(betAmount >2){
        betAmount = 0;
        document.getElementById("betAmount").textContent = betAmount;
        totalCredits = startCreditAmount - betAmount;
        document.getElementById("creditAmount").textContent = totalCredits;
    }else{
        betAmount = betAmount+1;
        document.getElementById("betAmount").textContent = betAmount;
        totalCredits = startCreditAmount - betAmount;
        document.getElementById("creditAmount").textContent = totalCredits;
    }
}

function betMax() {
    betAmount = 3;
    document.getElementById("betAmount").textContent = betAmount;
    totalCredits = startCreditAmount - betAmount;
    document.getElementById("creditAmount").textContent = totalCredits;
}

function addCoin() {
    startCreditAmount++;
    document.getElementById("creditAmount").textContent = startCreditAmount;
}

document.addEventListener('DOMContentLoaded', function () {
    document.querySelector('#spin_reels').addEventListener('click', spin);
});

document.addEventListener('DOMContentLoaded', function () {
    document.querySelector('#stop').addEventListener('click', stop);
});

document.addEventListener('DOMContentLoaded', function () {
    document.querySelector('#bet_one').addEventListener('click', bet);
});

document.addEventListener('DOMContentLoaded', function () {
    document.querySelector('#bet_max').addEventListener('click', betMax);
});

document.addEventListener('DOMContentLoaded', function () {
    document.querySelector('#add_coin').addEventListener('click', addCoin);
});
