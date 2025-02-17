<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<c:choose>
    <c:when test="${fn:contains(header.accept, 'application/xml')}">
<% response.setContentType("application/xml"); %>
<?xml version='1.0' encoding='UTF-8'?>
<errors>
   <error>
      <message>Unknown server error</message>
      <type>UnknownError</type>
   </error>
</errors>
</c:when>
    <c:otherwise><% response.setContentType("application/json"); %>{
   "errors" : [ {
      "message": "Unknown server error",
      "type": "UnknownError"
   } ]
}
</c:otherwise>
</c:choose>
