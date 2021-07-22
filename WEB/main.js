function isAlphabet() {
    var unamer = document.getElementById("uname1");
    var emailr = document.getElementById("email1");
    var AlphExp = /^[a-zA-Z ]+$/;
    var EmailExp = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

    if (unamer.value.match(AlphExp)) {
        document.getElementById("unameregex").innerHTML = "";
        if (unamer.value.length < 5) {
            document.getElementById("unameregex").innerHTML = "Minimum 5 characters";
            return false;
        }
        else {
            document.getElementById("unameregex").innerHTML = "";
            if (emailr.value.match(EmailExp)) {
                document.getElementById("emailregex").innerHTML = "";
            }
            else {
                document.getElementById("emailregex").innerHTML = "Please enter a valid email";
                return false;
            }
        }
    }
    else {
        document.getElementById("unameregex").innerHTML = "Only letters allowed";
        return false;
    }
}