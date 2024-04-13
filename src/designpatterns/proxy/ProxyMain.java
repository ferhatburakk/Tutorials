package designpatterns.proxy;

public class ProxyMain {
    public static void main(String[] args) {
        Employee hrSpecialist = new HumanResourcesEmployee("Çalışan1","İnsan Kaynakları","Uzman");
        Employee hrIntern = new HumanResourcesEmployee("Çalışan2","İnsan Kaynakları","Stajyer");

        Employee webDeveloper = new WebDeveloperEmployee("Çalışan3","Software","Yönetici");
        Employee mobileDeveloper = new MobileDeveloperEmployee("Çalışan4","Software","Stajyer");

        Employee whiteRabbit = new CyberSecurityEmployee("Çalışan5","Siber Güvenlik","Uzman");


        String request;

        request = "Projeye Çalışan Ata";

        hrSpecialist.manageAnotherEmployee(request);
        hrIntern.manageAnotherEmployee(request);
        webDeveloper.manageAnotherEmployee(request);
        mobileDeveloper.manageAnotherEmployee(request);
        whiteRabbit.manageAnotherEmployee(request);
        System.out.println("--");

        request = "Çalışan Bilgilerini Görüntüle";

        hrSpecialist.manageAnotherEmployee(request);
        hrIntern.manageAnotherEmployee(request);
        webDeveloper.manageAnotherEmployee(request);
        mobileDeveloper.manageAnotherEmployee(request);
        whiteRabbit.manageAnotherEmployee(request);
    }
}
