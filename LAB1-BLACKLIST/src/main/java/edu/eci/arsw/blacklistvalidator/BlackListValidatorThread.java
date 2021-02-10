package edu.eci.arsw.blacklistvalidator;

import edu.eci.arsw.spamkeywordsdatasource.HostBlacklistsDataSourceFacade;

import java.util.ArrayList;
import java.util.LinkedList;


public class BlackListValidatorThread extends Thread {

    private String ipaddres;
    private int inicio;
    private int fin;
    private int ocurrencesCount = 0;
    private HostBlacklistsDataSourceFacade skds;
    private ArrayList<Integer> blackListOcurrences = new ArrayList<Integer>();
    private HostBlackListsValidator hblv;

    private static final int BLACK_LIST_ALARM_COUNT = 5;


    public BlackListValidatorThread(String ipaddres, int inicio, int fin, HostBlacklistsDataSourceFacade skds,HostBlackListsValidator hblv) {
        this.ipaddres = ipaddres;
        this.inicio = inicio;
        this.fin = fin;
        this.skds = skds;
        this.hblv = hblv;
    }

    @Override
    public void run() {
        for (int i = inicio; i < fin && hblv.getOcurrencesCount() < BLACK_LIST_ALARM_COUNT ; i++) {
            if (skds.isInBlackListServer(i, this.ipaddres)) {
                blackListOcurrences.add(i);
                synchronized (hblv) {
                    hblv.OcurrencesCountMas(i);
                }
            }
        }

    }

    public int getOcurrencesCount() {
        return ocurrencesCount;
    }

    public void setOcurrencesCount(int ocurrencesCount) {this.ocurrencesCount = ocurrencesCount;}

    public ArrayList<Integer> getBlackListOcurrences() { return blackListOcurrences;  }
}
