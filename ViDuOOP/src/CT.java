
public class CT {

	public static void main(String[] args) {
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham(2, "Bánh Chuối", "Đồ ăn nhanh", "bc.jpg");
		sp1.setMaSP(1);
		sp1.setTenSP("Nước Cam");
		sp1.setLoaiSP("Thức uống");
		sp1.setAnhSP("orange.jpg");
		
		//In thông tin sản phẩm
		String thongtinSP1 = sp1.toString();
		//String thongtinSP2 = sp2.toString();
		String thongtinSP2 = "Mã SP2 là " + sp2.getMaSP();
			thongtinSP2 += ", Tên SP2 là " + sp2.getTenSP();
		
		System.out.println(thongtinSP1);
		System.out.print(thongtinSP2);

	}

}
