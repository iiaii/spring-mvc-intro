<%@ page import="me.iiaii.springmvcintro.servlet.repository.MemberRepository" %>
<%@ page import="me.iiaii.springmvcintro.servlet.domain.Member" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: cjh
  Date: 2021/04/01
  Time: 11:38 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    MemberRepository memberRepository = MemberRepository.getInstance();
    List<Member> members = memberRepository.findAll();
%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<a href="/index.html">메인</a>
<table>
    <thead>
    <th>id</th>
    <th>username</th>
    <th>age</th>
    </thead>
    <tbody>
    <%
        for (Member member : members) {
            out.write("   <tr>");
            out.write("   <td>" + member.getId() + "</td>");
            out.write("   <td>" + member.getUsername() + "</td>");
            out.write("   <td>" + member.getAge() + "</td>");
            out.write("   </tr>");
        }
    %>
    </tbody>
</table>
</body>
</html>