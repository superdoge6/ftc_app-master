package com.qualcomm.ftcrobotcontroller.opmodes.caftc;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Thomas_Hoffmann on 9/25/2015.  Also edited by Caleb and stuffs and ben and stuffs
 */

//Robot with basic driving capabilities
public abstract class BasicHardware extends OpMode{
    //Execution order : Start, Init, Loop, Stop

    //Driving Motors
    DcMotor driveRight;
    DcMotor driveLeft;

    //Arm base servo
    Servo armServo;

    //zip line thingy
    Servo zipLeft;
    Servo zipRight;

    DcMotor spoolMotor1;
    DcMotor spoolMotor2;

    Servo climbersArm;

    Servo leftArm;
    Servo rightArm;

    @Override
    public void init(){
        driveRight = hardwareMap.dcMotor.get("drive_right"); //motor3
        driveLeft = hardwareMap.dcMotor.get("drive_left"); //motor1
        leftArm = hardwareMap.servo.get("leftArm");
        rightArm = hardwareMap.servo.get("rightArm");
        armServo = hardwareMap.servo.get("arm"); //bottom arm joint motor5
        spoolMotor1 = hardwareMap.dcMotor.get("spool1");
        spoolMotor2 = hardwareMap.dcMotor.get("spool2");
        zipRight = hardwareMap.servo.get("zipRight");
        zipLeft = hardwareMap.servo.get("zipLeft");
        climbersArm = hardwareMap.servo.get("people_dropper"); //for climbers
    }
}