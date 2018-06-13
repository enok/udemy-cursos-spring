Open Closed Prinpiple
----------------------
<<BAD>>

public class HealthInsuranceSurveyor {
    public boolean isValidClaim() {
        System.out.println("HealthInsuranceSurveyor: Validating health insurance claim...");
        /*Logic to validate health insurance claims*/
        return true;
    }
}

public class ClaimApprovalManager {
    public void processHealthClaim (HealthInsuranceSurveyor surveyor) {
        if(surveyor.isValidClaim()) {
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }
}

public class ClaimApprovalManager {
    public void processHealthClaim (HealthInsuranceSurveyor surveyor) {
        if(surveyor.isValidClaim()) {
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }
    public void processVehicleClaim (VehicleInsuranceSurveyor surveyor) {
        if(surveyor.isValidClaim()) {
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }
}
------------------------------------------
<<BETTER>>

public abstract class InsuranceSurveyor {
    public abstract boolean isValidClaim();
}

public class HealthInsuranceSurveyor extends InsuranceSurveyor {
    public boolean isValidClaim(){
        System.out.println("HealthInsuranceSurveyor: Validating health insurance claim...");
        /*Logic to validate health insurance claims*/
        return true;
    }
}

public class VehicleInsuranceSurveyor extends InsuranceSurveyor {
    public boolean isValidClaim(){
       System.out.println("VehicleInsuranceSurveyor: Validating vehicle insurance claim...");
        /*Logic to validate vehicle insurance claims*/
        return true;
    }
}

public class ClaimApprovalManager {
    public void processClaim(InsuranceSurveyor surveyor) {
        if(surveyor.isValidClaim()) {
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }
}




