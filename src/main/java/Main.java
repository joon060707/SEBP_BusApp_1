import GUI.BusGUI;
import Parse.Arrive;
import Parse.BusLineMap;
import Parse.StopListSet;
import org.json.simple.parser.ParseException;

import java.awt.*;
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException, ParseException {
        Arrive a=new Arrive(907);
        a.print();

        new Arrive(1253).print();

        StopListSet s= new StopListSet();
        s.StopListPrint();
        new BusLineMap(9).BusLinePrint();

        BusGUI.mainMenu().start();
        BusGUI.alertPopup("알림창", "알림창 테스트입니다. 알림창 테스트입니다.", Color.red, 15).start();




    }
}
