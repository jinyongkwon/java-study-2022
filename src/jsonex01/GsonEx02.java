package jsonex01;

import com.google.gson.Gson;

class SMSDto {
    private String groupId;
    private int successCount;
    private int errorCount;

    public SMSDto(String groupId, int successCount, int errorCount) {
        this.groupId = groupId;
        this.successCount = successCount;
        this.errorCount = errorCount;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public int getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(int successCount) {
        this.successCount = successCount;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }

}

public class GsonEx02 {
    public static void main(String[] args) {
        SMSDto smsDto = new SMSDto("R2GdEONszq64lNB9", 1, 0);
        Gson gson = new Gson();
        String jsonsmsDto = gson.toJson(smsDto);
        System.out.println(jsonsmsDto);

        SMSDto javaSMSDto = gson.fromJson(jsonsmsDto, SMSDto.class);
        System.out.println(javaSMSDto.getGroupId());
        System.out.println(javaSMSDto.getSuccessCount());
        System.out.println(javaSMSDto.getErrorCount());
    }
}
