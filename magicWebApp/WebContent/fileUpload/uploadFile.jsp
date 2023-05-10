<%@page import="com.jspsmart.upload.File"%>
<%@page import="com.jspsmart.upload.SmartUpload"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

// 	객체생성
	SmartUpload uploadLibrary = new SmartUpload();
	
// 	기존에 남아있는 파일이 있으면 비움 (초기화)
	uploadLibrary.initialize(pageContext);

// 업로드 준비	
	uploadLibrary.upload();
	
// 	업로드 파일갯수
	int last = uploadLibrary.getFiles().getCount();
	int cnt = 0;
	
// 	업로드 파일갯수만큼 반복
	for(int i=0; i < last; i++) {
		
		// 업로드파일
		File file = uploadLibrary.getFiles().getFile( i );
		
// 		파일존재시 file.saveAs() 메소드로 저장
		if ( !file.isMissing() ) {
			file.saveAs("/uploadFiles/" + file.getFileName() ); // 현재경로에있는 uploadFiles 하위폴더에 파일이름으로 저장
			
			out.print("폼 태그 필드 이름 : " + file.getFieldName() + "<br>" );
			out.print("파일 이름 : " + file.getFileName() + "<br>" );
			out.print("파일 크기 : " + file.getSize() + "<br>" );
			out.print("파일 확장자 : " + file.getFileExt() + "<br>" );
			out.print("파일 경로 : " + file.getFilePathName() + "<br>" );
			out.print("<br>=========================================================<br>");
			
			cnt++;			
		}		
	}

	out.print("파일 " + cnt + "개를 업로드 했습니다.");


%>
	// 업로드경로
	// D:\eclipse\Repository\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\magicWebApp\uploadFiles