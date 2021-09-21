function checkauth(){
    $.ajax({

    })
}

function signout(){
    $.ajax({
        url: '/signouts',
        method: 'GET',
        contentType: "application/json",
        success: function (data) {
            checkSuccessSO(data);
        },
        error: function (data){
            alert(data.status);
        }
    })
}
function gotomain(){

}
function battlesearch(){

}

function checkSuccessSO(data){
    switch (data.key){
        case "200":{
            document.location.href = "/signin";
            break;
        }
        default:{
            alert("Error" + data.key + " " + data.status);
        }
    }
}
