package rsys_proxy

import com.rsys.ws.*

class RsysProxyController {

    def index() { }

    def ping() { render "PONG" }

    def test() {
        try {
            ResponsysWSServiceStub stub = new ResponsysWSServiceStub();
            stub._getServiceClient().getOptions().setManageSession(true);

            Login login = new Login();
            login.setUsername("app_user");
            login.setPassword("App_user3");

            LoginResponse loginResponse = stub.login(login);
            LoginResult loginResult = loginResponse.getResult();

            String sessionId = loginResult.getSessionId();

            render "Me conecte a Responsys, hice login y el sessionID es $sessionId\n\n"
            SessionHeader sessionHeader = new SessionHeader();
            sessionHeader.setSessionId(sessionId);

            ListFoldersResponse folders = stub.listFolders(new ListFolders(), sessionHeader);
            FolderResult[] folderList = folders.getResult();
            render "El servicio de folders me retorna: \n"
            if (folderList != null) {
                for (FolderResult name : folderList) {
                    String str_name = name.getName()
                    render "  - $str_name\n"
                }
            } else {
                render "No pude acceder a ver los folders :("
            }
        } catch (Exception ex) {
            render "No funciona :("
        }
    }
}
