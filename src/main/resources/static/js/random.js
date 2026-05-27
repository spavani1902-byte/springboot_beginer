function displayUser(user){
    document.getElementById("userImage").src=user.img;
    document.getElementById("userName").textContent=user.name;
    document.getElementById("userGender").textContent=user.gender;
}
function getAndDisplayNextRandomUser(){
    fetch("https://randomuser.me/api/")
    .then(function(res){
        return res.json();
    })
    .then(function(data){
        var userData=data.results[0];
        var myUserObject={};
        myUserObject.name=userData.name.title+" "+userData.name.first+" "+userData.name.last;
        myUserObject.gender=userData.gender;
        myUserObject.img=userData.picture.large;
        displayUser(myUserObject);
    })
    .catch(function(err){
        console.error("Error fetching random user:", err);
    })
}