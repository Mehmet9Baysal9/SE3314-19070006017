package org.example;

/**
 * The main application class to demonstrate character creation, navigation, and quest completion.
 */
public class App
{
    /**
     * Bu sınıfın bir örneği oluşturulmasını engellemek için gizli bir constructor tanımlayın.
     */
    private App() {
        // Bu sınıf bir utility sınıfı olarak işlev görmemeli, bu nedenle örneklenmesini önlemek için boş bir gizli constructor ekliyoruz.
    }

    /**
     * The entry point of the application.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        // Frodo karakterini oluştur ve detaylarını yazdır
        Character frodo = new Character("Frodo", "Hobbit", 50, "Ring Bearer");
        frodo.printDetails();

        // Middle-Earth haritasını oluştur ve Mordor'a navigasyon yap
        MiddleEarthMap map = new MiddleEarthMap();
        map.navigate("Mordor", true); // Gizli geçit var mı yok mu bilgisini ekledik

        // Bir quest oluştur ve tamamla
        Quest quest = new Quest("Journey to Mount Doom", 80, 4);
        quest.completeQuest(100, true); // Puan ve yüzük taşıyıcı bilgilerini ekledik
    }
}


