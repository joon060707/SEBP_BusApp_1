import GUI.BusGUI;
import Parse.*;
import org.json.simple.parser.ParseException;

import java.awt.*;
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException, ParseException {

        new BusListSet(1).BusListPrint();

//        Arrive a=new Arrive(907);
//        a.print();
//
//        StopListSet s= new StopListSet();
//        s.StopListPrint();
//        new BusLineMap(9).BusLinePrint();

        BusGUI.mainMenu().start();
//        BusGUI.alertPopup("알림창", "알림창 테스트입니다. 알림창 테스트입니다.", Color.red, 20).start();




    }
}
