import java.util.Objects;

public class Restaurant {
    private final String[] nama_makanan;
    private final double[] harga_makanan;
    private final int[] stok;
    private static byte id = 0;

    public Restaurant(){
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok){
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = stok;
    }

    public void tampilMenuMakanan(){
        for(int i = 0; i <= id; i++){
            if(!isOuOfStock(i)){
                System.out.println(nama_makanan[i] + "["+stok[i]+"]"+"\tRp. "+harga_makanan[i]);
            }
        }
    }

    public void pesanMakanan (String name, int jumlahPesanan){
        boolean isAvailable = false;
        for (int i = 0; i <= id; i++){
            if(Objects.equals(name, getNamaMakanan(i))){
                if(isOuOfStock(i)) {
                    double totalHarga = getHarga(i) * jumlahPesanan;
                    System.out.println("Berhasil memesan " + name + " sebanyak " + jumlahPesanan + " dengan total harga : " + totalHarga);
                    isAvailable = true;
                    setStock(i, getStock(i) - jumlahPesanan);
                }
            }
        }
        if(!isAvailable){
            System.out.println("Maaf makanan tidak tersedia.");
        }
    }

    public double getHarga(int id){
        return harga_makanan[id];
    }

    public String getNamaMakanan(int id){
        return nama_makanan[id];
    }

    public void setStock(int id, int stock){
        stok[id] = stock;
    }

    public int getStock(int id){
        return stok[id];
    }

    public boolean isOuOfStock(int id) {
        return stok[id] == 0;
    }

    public static void nextId(){
        setId((byte) (getId()+1));
    }

    public static void setId(byte i){
        id = i;
    }

    public static byte getId(){
        return id;
    }
}
