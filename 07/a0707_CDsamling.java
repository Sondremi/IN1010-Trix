import java.io.*;
import java.util.*;

class CDAlbum implements Comparable<CDAlbum> {
    private String artistNavn;
    private String albumNavn;
    private String utgivelsesaar;

    public CDAlbum(String artistN, String albumN, String uaar) {
        this.artistNavn = artistN;
        this.albumNavn = albumN;
        this.utgivelsesaar = uaar;
    }

    public String hentArtistNavn() {
        return this.artistNavn;
    }

    public int compareTo(CDAlbum album) {
        int lengde1 = hentArtistNavn().length();
        int lengde2 = album.hentArtistNavn().length();
       
        int i = 0;  
        while (i < lengde1 && i < lengde2) {  
            char ch1 = hentArtistNavn().charAt(i);  
            char ch2 = album.hentArtistNavn().charAt(i);  
            if (ch1 != ch2) {  
                return ch1 - ch2;  
            }  
            i++;  
        }  
        return lengde1 - lengde2; 
    }

    public String toString() {
        return artistNavn + "," + albumNavn + "," + utgivelsesaar;
    }
}

class CDSamling {
    public static void main(String[] args) {
        ArrayList<CDAlbum> CDsamling = lesOgSorter("cdliste.txt");
        
        for (CDAlbum album : CDsamling) {
            System.out.println(album);
        }

        skrivTilFil(CDsamling);
    }

    public static ArrayList<CDAlbum> lesOgSorter(String fil) {
        ArrayList<CDAlbum> CDSamling = new ArrayList<>();
        Scanner filleser = null;
        try {
            filleser = new Scanner(new File(fil));
        } catch (FileNotFoundException e) {
            System.out.println("Filen finnes ikke: " + e.getMessage());
            return null;
        }

        while (filleser.hasNextLine()) {
            String[] linjeDelt = filleser.nextLine().split(",");
            CDAlbum nyttAlbum = new CDAlbum(linjeDelt[0], linjeDelt[1], linjeDelt[2]);

            boolean sattInn = false;
            int teller = 0;

            while (teller < CDSamling.size() && !sattInn) {
                if (nyttAlbum.compareTo(CDSamling.get(teller)) < 0) {
                    CDSamling.add(teller, nyttAlbum);
                    sattInn = true;
                }
                teller++;
            }
            if (!sattInn) {
                CDSamling.add(nyttAlbum);
            }
        }
        filleser.close();
        return CDSamling;
    }

    public static void skrivTilFil(ArrayList<CDAlbum> CDsamling) {
        Scanner tastatur = new Scanner(System.in);
        System.out.println("\nOppgi navn på filen du skal skrive til: ");
        String filnavn = tastatur.nextLine();
        tastatur.close();
        try {
            PrintWriter skriver = new PrintWriter(new File(filnavn));

            for (CDAlbum album : CDsamling) {
                skriver.append(album.toString() + "\n");
            }
            skriver.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}