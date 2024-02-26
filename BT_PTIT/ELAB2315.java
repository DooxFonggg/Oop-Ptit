import java.util.*;

class TaiKhoan {
    private String id;
    private String ten;
    private List<Map<String, String>> ghiChu;

    public TaiKhoan(String id, String ten) {
        this.id = id;
        this.ten = ten;
        this.ghiChu = new ArrayList<>();
    }

    public void themGhiChu(String ngay, String noiDung) {
        Map<String, String> ghiChuMoi = new HashMap<>();
        ghiChuMoi.put("id", Integer.toString(ghiChu.size() + 1));
        ghiChuMoi.put("ngay", ngay);
        ghiChuMoi.put("noiDung", noiDung);
        ghiChu.add(ghiChuMoi);
    }

    public void chiaSeGhiChu(TaiKhoan taiKhoanKhac, int idGhiChu) {
        for (Map<String, String> ghiChu : this.ghiChu) {
            if (Integer.parseInt(ghiChu.get("id")) == idGhiChu) {
                taiKhoanKhac.themGhiChu(ghiChu.get("ngay"), ghiChu.get("noiDung"));
                return;
            }
        }
        System.out.println("invalid input");
    }

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public List<Map<String, String>> getGhiChu() {
        return ghiChu;
    }
}

public class ELAB2315 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<TaiKhoan> taiKhoanDs = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        if (n < 1) {
            System.out.println("invalid input");
            return;
        }

        for (int i = 0; i < n; i++) {
            String ten = scanner.nextLine().trim();
            taiKhoanDs.add(new TaiKhoan(String.format("00%d", i + 1), ten));
        }

        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().trim().split(" ");
            if (line.length == 0 || line.length < 3) break;

            String idTaiKhoan = line[0];
            String luaChon = line[1];

            if (luaChon.equals("Add")) {
                String ngay = line[2];
                String noiDung = String.join(" ", Arrays.copyOfRange(line, 3, line.length));
                boolean found = false;
                for (TaiKhoan taiKhoan : taiKhoanDs) {
                    if (taiKhoan.getId().equals(idTaiKhoan)) {
                        taiKhoan.themGhiChu(ngay, noiDung);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("invalid input");
                    return;
                }
            } else if (luaChon.equals("Share")) {
                if (line.length != 4) {
                    System.out.println("invalid input");
                    return;
                }
                String idNguoiDung = line[2];
                int idGhiChu = Integer.parseInt(line[3]);
                boolean found = false;
                for (TaiKhoan taiKhoan : taiKhoanDs) {
                    if (taiKhoan.getId().equals(idTaiKhoan)) {
                        for (TaiKhoan taiKhoanKhac : taiKhoanDs) {
                            if (taiKhoanKhac.getId().equals(idNguoiDung)) {
                                taiKhoan.chiaSeGhiChu(taiKhoanKhac, idGhiChu);
                                found = true;
                                break;
                            }
                        }
                        break;
                    }
                }
                if (!found) {
                    System.out.println("invalid input");
                    return;
                }
            } else {
                System.out.println("invalid input");
                return;
            }
        }

        for (TaiKhoan taiKhoan : taiKhoanDs) {
            System.out.println("Account: " + taiKhoan.getTen());
            for (Map<String, String> ghiChu : taiKhoan.getGhiChu()) {
                String ngay = ghiChu.get("ngay");
                String formattedNgay = String.format("%s %s %s", ngay.substring(3, 5), ngay.substring(0, 3), ngay.substring(5));
                System.out.println(formattedNgay + " | " + ghiChu.get("noiDung"));
            }
        }
    }
}
