package example.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
 * Created by relango on 3/26/2014.
 */
public class UsingGroupBy {
    public static void main(String[] args) {
        List<Transceiver> transceivers = new ArrayList<>();
        transceivers.add(new Transceiver("AJNA-SJL-SFZ", "radio-sjl.dmz.salesforce.com:443"));
        transceivers.add(new Transceiver("AJNA-ASG-SFZ", "radio-asg.dmz.salesforce.com:443"));
        transceivers.add(new Transceiver("AJNA-tyo-SFZ", "radio-tyo.dmz.salesforce.com:443"));
        transceivers.add(new Transceiver("AJNA-CHI-SP1-SFZ", "radio-chi-sp1.dmz.salesforce.com:443"));
        transceivers.add(new Transceiver("AJNA-CHI-SP2-SFZ", "radio-chi-sp2.dmz.salesforce.com:443"));
        transceivers.add(new Transceiver("AJNA-WAS-SP1-SFZ", "radio-was-sp1.dmz.salesforce.com:443"));
        transceivers.add(new Transceiver("AJNA-WAS-SP2-SFZ", "radio-was-sp2.dmz.salesforce.com:443"));
        Map<String,List<String>> tranceiversByDatacenterSuperpod = transceivers.stream().collect(Collectors.groupingBy(Transceiver::getCluster, mapping(Transceiver::getVipUrl, toList())));
        System.out.println(tranceiversByDatacenterSuperpod);
    }
}
