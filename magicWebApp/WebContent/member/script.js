function getValue(elementName) {
	return document.getElementsByName(elementName)[0].value;
}

 function check_ok() {
    if ( getValue("MEM_UID").length == 0 ) { alert("아이디를 써주세요"); }
    else if ( getValue("MEM_UID").length < 4 ) { alert("아이디는 4글자 이상이어야 합니다."); }
    else if ( getValue("MEM_PWD").length == 0 ) { alert("패스워드는 반드시 입력해야 합니다."); } 
    else if ( getValue("MEM_PWD") != getValue("MEM_PWD2") ) { alert("패스워드가 일치하지 않습니다."); }
    
    else if ( getValue("MEM_NAME").length == 0 ) { alert("이름을 써주세요"); }
    else if ( getValue("MEM_EMAIL").length == 0 ) { alert("Email을 써주세요"); }

	else {
		document.getElementById("myForm").submit();
	}
}