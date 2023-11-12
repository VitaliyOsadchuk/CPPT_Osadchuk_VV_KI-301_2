package KI301_Osadchuk_Lab6;

public class GunSafeAllInfo { 
	public static void main(String[] args) { 
		GunSafe<? super GunSafeInfo> safe = new GunSafe<GunSafeInfo>(); 
		safe.WriteToPC(new AmmunitionSafe()); 
		safe.WriteToPC(new HuntingWeaponSafe()); 
		safe.WriteToPC(new PistolSafe()); 
		safe.WriteToPC(new AmmunitionSafe(7, 30, 40, 2450)); 
		safe.WriteToPC(new PistolSafe(15, 45, 38, 3950));
		safe.WriteToPC(new HuntingWeaponSafe(31,140,190,6200));
		GunSafeInfo smallestsafe = safe.findMinPrice(); 
		System.out.print("\n Сейф з найменшою ціною: \n\n"); 
		smallestsafe.print_info();
		}
	} 