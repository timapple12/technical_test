<html>
<form name='login' action="<c:url value='/login' />" method='POST'>
    <c:if test="${not empty error}"><div>${error}</div></c:if>
    <c:if test="${not empty message}"><div>${message}</div></c:if>
    <table>
        <tr>
            <td>UserName:</td>
            <td><input type='text' name='username' value=''></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type='password' name='password' /></td>
        </tr>
        <tr>
            <td colspan='2'><input name="submit" type="submit" value="submit" /></td>
        </tr>
    </table>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
</form>
</body>
</html>