package behavioral.patterns.command.example;

import behavioral.patterns.command.example.entity.CeilingFan;
import behavioral.patterns.command.example.entity.Light;
import behavioral.patterns.command.example.entity.Sprinkler;
import behavioral.patterns.command.example.entity.Stereo;
import lombok.extern.log4j.Log4j2;

/**
 * 他人例子
 */
@Log4j2
public class AppMain {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();

        Light kitchenLight = new Light();
        //  Light washroomLight = new Light();
        Sprinkler sprinkler = new Sprinkler();
        Stereo stereo = new Stereo();
        CeilingFan ceilingFan = new CeilingFan("电风扇");

        LightOnCommend kitchenLightOnCommend = new LightOnCommend(kitchenLight);
        LightOffCommend kitchenLightOffCommend = new LightOffCommend(kitchenLight);

        //   LightOnCommend washroomLightOnCommend =new LightOnCommend(washroomLight);
        //   LightOffCommend washroomLightOffCommend =new LightOffCommend(washroomLight);

        SprinklerOnCommend sprinklerOnCommend = new SprinklerOnCommend(sprinkler);
        SprinklerOffCommend sprinklerOffCommend = new SprinklerOffCommend(sprinkler);

        StereoOnCommend stereoOnCommend = new StereoOnCommend(stereo);
        StereoOffCommend stereoOffCommend = new StereoOffCommend(stereo);

        CeilingFanHighCommend ceilingFanHighCommend = new CeilingFanHighCommend(ceilingFan);
        CeilingFanMediumCommend ceilingFanMediumCommend = new CeilingFanMediumCommend(ceilingFan);
        // CeilingFanLowCommend ceilingFanLowCommend =new CeilingFanLowCommend(ceilingFan);
        CeilingFanOffCommend ceilingFanOffCommend = new CeilingFanOffCommend(ceilingFan);

        remoteController.setCommend(0, kitchenLightOnCommend, kitchenLightOffCommend);
        // remoteController.setCommend(1,washroomLightOnCommend,washroomLightOffCommend);
        remoteController.setCommend(2, sprinklerOnCommend, sprinklerOffCommend);
        remoteController.setCommend(3, stereoOnCommend, stereoOffCommend);

        remoteController.setCommend(4, ceilingFanHighCommend, ceilingFanOffCommend);
        remoteController.setCommend(5, ceilingFanMediumCommend, ceilingFanOffCommend);
        remoteController.setCommend(6, ceilingFanOffCommend, ceilingFanOffCommend);

        log.info(remoteController);

        remoteController.onButtonPushed(0);
        remoteController.undoButtonPushed();
        //   remoteController.onButtonPushed(1);
        remoteController.onButtonPushed(2);
        remoteController.undoButtonPushed();
        remoteController.onButtonPushed(3);
        remoteController.onButtonPushed(4);
        remoteController.undoButtonPushed();
        remoteController.onButtonPushed(5);
        remoteController.onButtonPushed(6);

        remoteController.offButtonPushed(0);
        //   remoteController.offButtonPushed(1);
        remoteController.undoButtonPushed();
        remoteController.offButtonPushed(2);
        remoteController.undoButtonPushed();
        remoteController.offButtonPushed(3);
        remoteController.offButtonPushed(4);

        // 遥控器上面未找到的是空方法，不会产生任何实际操作
        remoteController.offButtonPushed(1);
    }
}
