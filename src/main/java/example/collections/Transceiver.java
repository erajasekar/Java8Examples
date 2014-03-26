package example.collections;

/**
 * Created by relango on 3/26/2014.
 */
public class Transceiver {

    private String cluster;

    private String vipUrl;

    public Transceiver(String cluster, String vipUrl) {
        this.cluster = cluster;
        this.vipUrl = vipUrl;
    }

    public String getCluster() {
        return cluster;
    }

    public String getVipUrl() {
        return vipUrl;
    }
}