package presentation.common;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.HashMap;

public class StageController {

    private HashMap<String, Stage> stages = new HashMap<String, Stage>();


    public void addStage(String name, Stage stage) {
        stages.put(name, stage);
    }

    public Stage getStage(String name) {
        return stages.get(name);
    }


    public void setPrimaryStage(String primaryStageName, Stage primaryStage) {
        this.addStage(primaryStageName, primaryStage);
    }


    public boolean loadStage(String name, String resources) {
        try {
            //加载FXML资源文件
            FXMLLoader loader = new FXMLLoader(getClass().getResource(resources));
            Pane tempPane = (Pane) loader.load();

            //通过Loader获取FXML对应的ViewCtr，并将本StageController注入到ViewCtr中
            ControlledStage controlledStage = (ControlledStage) loader.getController();
            controlledStage.setStageController(this);

            //构造对应的Stage
            Scene tempScene = new Scene(tempPane);
            Stage tempStage = new Stage();
            tempStage.setScene(tempScene);


            //将设置好的Stage放到HashMap中
            this.addStage(name, tempStage);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 显示Stage但不隐藏任何Stage
     *
     * @param name 需要显示的窗口的名称
     * @return 是否显示成功
     */
    public boolean setStage(String name) {
        this.getStage(name).show();
        return true;
    }


    /**
     * 显示Stage并隐藏对应的窗口
     *
     * @param show  需要显示的窗口
     * @param close 需要删除的窗口
     * @return
     */
    public boolean setStage(String show, String close) {
        getStage(close).close();
        setStage(show);
        return true;
    }

}
