package Buoi5.TH3.BaiThucHanhNangCao.Bai1;

import java.util.Scanner;

public class TamGiac extends DaGiac{
    public TamGiac() {
    }

    public TamGiac(int soCanh, int[] kichThuoc) {
        super(soCanh, kichThuoc);
    }

    @Override
    public void nhapTT() {
        Scanner scanner = new Scanner(System.in);
        TamGiac tamGiac = new TamGiac();

        this.setSoCanh(3);

        int[] listKichThuoc = new int[soCanh];
        for(int i = 0; i < this.soCanh; i++){
            System.out.println("Nhap canh thu[" + (i + 1) + "] cua tam giac:");
            int kichThuoc = scanner.nextInt();
            scanner.nextLine();

            listKichThuoc[i] = kichThuoc;
        }
        this.setKichThuoc(listKichThuoc);
    }

    public double dienTich(){
        float p = this.chuVi() / 2;
        float dienTich = p * (p - this.getKichThuoc()[0]) * (p - this.getKichThuoc()[1]) * (p - this.getKichThuoc()[2]);
        return Math.sqrt(dienTich);
    }
}
