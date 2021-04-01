<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="me.iiaii.springmvcintro.servlet.domain.Member" %>
<%@ page import="me.iiaii.springmvcintro.servlet.repository.MemberRepository" %><%--
  Created by IntelliJ IDEA.
  User: cjh
  Date: 2021/04/01
  Time: 11:28 오후
  To change this template use File | Settings | File Templates.
--%>
<%
    // request, response 사용 가능
    MemberRepository memberRepository = MemberRepository.getInstance();

    System.out.println("MemberSaveServlet.service");
    String username = request.getParameter("username");
    int age = Integer.parseInt(request.getParameter("age"));

    Member member = new Member(username, age);
    memberRepository.save(member);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
성공
<ul>
    <li>id=<%=member.getId()%></li>
    <li>username=<%=member.getUsername()%></li>
    <li>age=<%=member.getAge()%></li>
</ul>
<a href="/index.html">메인</a>
</body>
</html>
