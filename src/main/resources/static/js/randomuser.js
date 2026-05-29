function displayUser(user) {
    document.getElementById("userImage").src = user.image;
    document.getElementById("userName").textContent = user.name;
    document.getElementById("userGender").textContent = user.gender;
}

function getAndDisplayNextRandomUser() {
    fetch("http://localhost:8080/api/users")
        .then(function (res) {
            return res.json();
        })
        .then(function (data) {

            var randomIndex = Math.floor(Math.random() * data.length);
            var userData = data[randomIndex];

            displayUser(userData);
        })
        .catch(function (err) {
            console.error("Error fetching user:", err);
        });
}