<html>
<body>
<h2><a href="/web-debug-tag-example"> Hello World!</a></h2>
</body>
</html>
<%@ taglib prefix="debug" uri="https://github.com/figarocms/web-debug-tag"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="dummyVariable"  value="blabla" />
<debug:debugModel/>