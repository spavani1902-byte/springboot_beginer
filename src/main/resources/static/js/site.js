var users = [
    {
        name: "John Doe",
        gender: "Male",
        img: "img/john.png"
    },
    {
        name: "Jane Doe",
        gender: "Female",
        img: "img/jane.png"
    }
];

var currentUserIndex = 0;

function showHome() {
    document.getElementById("homeSection").style.display = "block";
    document.getElementById("userSection").style.display = "none";
    document.getElementById("toggleSection").style.display = "none";
}

function showCard() {
    document.getElementById("homeSection").style.display = "none";
    document.getElementById("userSection").style.display = "block";
    document.getElementById("toggleSection").style.display = "none";
}

function showToggle() {
    document.getElementById("homeSection").style.display = "none";
    document.getElementById("userSection").style.display = "none";
    document.getElementById("toggleSection").style.display = "block";
}

function toggleCard() {
    currentUserIndex = (currentUserIndex + 1) % users.length;

    var user = users[currentUserIndex];

    document.getElementById("userImage").src = user.img;
    document.getElementById("userName").innerHTML = user.name;
    document.getElementById("userGender").innerHTML = user.gender;
}