package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;

@TeleOp
public class Test extends LinearOpMode{

    public void runOpMode(){
        telemetry.addData("Controls", "Use Controls A and B to turn servo" );
        telemetry.update();
        double power = 0.9;

        waitForStart();
    }
}



