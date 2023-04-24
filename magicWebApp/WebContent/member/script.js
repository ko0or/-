function check_ok() {

    var info = {
        id : document.getElementsByName("MEM_UID")[0].value
        , pw : document.getElementsByName("MEM_PWD")[0].value
        , pw2 : document.getElementsByName("MEM_PWD2")[0].value
        , name : document.getElementsByName("MEM_NAME")[0].value
        , email : document.getElementsByName("MEM_EMAIL")[0].value
        , address : document.getElementsByName("MEM_ADDRESS")[0].value
    };

    if ( info.id.length == 0 ) { alert("아이디를 써주세요"); }
    else if ( info.id.length <= 4 ) { alert("아이디는 4글자 이상이어야 합니다."); }
    else if ( info.pw.length == 0 ) { alert("패스워드는 반드시 입력해야 합니다."); } 
    else if ( info.pw != info.pw2 ) { alert("패스워드가 일치하지 않습니다."); }
    
    else if ( info.name.length == 0 ) { alert("이름을 써주세요"); }
    else if ( info.email.length == 0 ) { alert("Email을 써주세요"); }


	else {
		document.getElementById("myForm").submit();
	}
}