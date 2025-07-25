package delegator;

public class BusinessDelegate {
    private BusinessLookUp lookupService = new BusinessLookUp();
    //private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    public void doTask(){
        BusinessService businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}