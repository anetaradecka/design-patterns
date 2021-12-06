package officer;

import message.Message;

public class General extends Officer {
    private static final int CODE = 30;
    private static  final String NAME = "Generał Zalewski";

    @Override
    public void processMessage(Message message) {
        if(message.getOfficerRank().equals(OfficerRank.GENERAL)
        && message.getCode() == CODE) {
            System.out.println(NAME + " otrzymał wiadomość: " + message.getContent());
        } else {
            System.out.println("Zły adresat wiadomości lub zły adresat wiadomości");
        }
    }
}
