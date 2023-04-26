function getValue(elementName) {
	return document.getElementsByName(elementName)[0].value;
}

function check_ok() {
    if ( getValue("b_name").length == 0 ) { alert("작성자를 입력해주세요"); }
    else if ( getValue("b_email").length == 0 ) { alert("이메일을 입력해주세요"); }
    else if ( getValue("b_title").length == 0 ) { alert("제목을 작성해주세요"); }
	else if ( getValue("b_content").length == 0 ) { alert("내용을 작성해주세요"); }

    else {
		document.getElementById("myForm").submit();
	}
}
