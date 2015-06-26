package rsys_proxy

class RsysProxyController {

    def index() { }

    def ping() { render "PONG" }

    def test() {
        try {
            com.rsys.ws.Login login = new com.rsys.ws.Login();
            com.rsys.ws.ResponsysWSServiceStub stub;
            stub = new com.rsys.ws.ResponsysWSServiceStub();
            stub._getServiceClient().getOptions().setManageSession(true);

            login.setUsername("app_user");
            login.setPassword("App_user3");

            com.rsys.ws.LoginResponse loginResponse = stub.login(login);
            com.rsys.ws.LoginResult loginResult = loginResponse.getResult();

            String sessionId = loginResult.getSessionId();
            render "Funciona, para vos Naza"
        } catch (Exception ex) {
            render "No funciona :("
        }
    }
}
