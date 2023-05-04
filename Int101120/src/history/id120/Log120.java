package history.id120;

public class Log120 {

    private final String name120;

    private final String[] activities;

    private int count = 0;

    private static final String[] allLog120 = new String[20];

    private static int logCount = 0;


    // 1.6
    public Log120(String name,int size){

        this.name120 = name == null || name.isBlank() ? "NOTITLE" : name;

        size = size < 3 ? 3 : size;

        this.activities = new String[size];

        for (int i = 0 ; i < allLog120.length; i++)
            if (i == allLog120.length - 1){
                allLog120[logCount++] = name120;
            }
    }

    //1.7
    public boolean perform(String activity){
        for (int i = 0 ; i < activities.length; i++)
            if (i == activities.length - 1 && activity != null && !activity.isBlank()){
                activities[count++] = activity;
                return true;
            }
        return false;
    }

    // 1.8
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Log120 [").append("name120: ").append(name120);
        s.append(" ,activities: ").append(activities.length);
        s.append(" =");
        for (int i = 0; i < count; i++) {
           s.append(" ").append(activities[i]);
        }
        return s.append("]").toString();
    }

    //1.9
    public static String getLogName(int index){
        for (int i = 0; i < logCount; i++){
            if(allLog120[index] == allLog120[i]){
                return allLog120[index];
            }
        }
        return "NOLOG";
    }
}
