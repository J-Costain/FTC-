package org.firstinspires.ftc.teamcode.robot;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

public class Lift {
    public DcMotorEx liftMotor;
    public lift(HardwareMap hwMap, Telemetry telemetry) {
        this.telemetry = telemetry;
        liftMotor = (DcMotorEx) hwMap.dcMotor.get("motorLift");
    }
}
