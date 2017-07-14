
public class DigitsToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value = 1115, num, choice = 0, hun_check = 1,thou_check = 0,counter = 0;
		num = value;
		while(num>0){
			if (num > 999 && num<10000){
				choice = num/1000;
				//thou_check = 1;
				//num = num%1000;
			}
			else if(num >99 && num<1000){
				choice = num/100;
				//num = num%100;
				hun_check = 0;
			}
			else if(num > 20 && num < 100){
				choice = num/10;
				//num = num%10;
			}
			else if(num>=1 && num<=20){
				choice = num;
			}
			switch(choice){
			case 1:
				if (num >0 && num< 10){
					System.out.print("one");
					num = 0;
				}
				else if(num>99 && num<1000){
					System.out.print("One hundred and ");
				}
				else if(num>999 && num < 10000){
					System.out.print("One thousand ");
				}
				break;
			case 2: 
				if (num >0 && num< 10){
					System.out.print("Two");
					num = 0;
				}
				else if(num>20 && num<100){
					System.out.print("Twenty ");
				}
				else if(num>99 && num<1000){
					System.out.print("Two hundred and ");
				}
				else if(num>999 && num < 10000){
					System.out.print("Two thousand ");
				}
				break;
			case 3: 
				if (num >0 && num< 10){
					System.out.print("Three");
					num = 0;
				}
				else if(num>20 && num<100){
					System.out.print("Thirty ");
				}
				else if(num>99 && num<1000){
					System.out.print("Three hundred and ");
				}
				else if(num>999 && num < 10000){
					System.out.print("Three thousand ");
				}
				break;
			case 4: 
				if (num >0 && num< 10){
					System.out.print("Four");
					num = 0;
				}
				else if(num>20 && num<100){
					System.out.print("Forty ");
				}
				else if(num>99 && num<1000){
					System.out.print("Four hundred and ");
				}
				else if(num>999 && num < 10000){
					System.out.print("Four thousand ");
				}
				break;
			case 5: 
				if (num >0 && num< 10){
					System.out.print("Five");
					num = 0;
				}
				else if(num>20 && num<100){
					System.out.print("Fifty ");
				}
				else if(num>99 && num<1000){
					System.out.print("Five hundred and ");
				}
				else if(num>999 && num < 10000){
					System.out.print("Five thousand ");
				}
				break;
			case 6:
				if (num >0 && num< 10){
					System.out.print("Six");
					num = 0;
				}
				else if(num>20 && num<100){
					System.out.print("Sixty ");
				}
				else if(num>99 && num<1000){
					System.out.print("Six hundred and ");
				}
				else if(num>999 && num < 10000){
					System.out.print("Six thousand ");
				}
				break;
			case 7:
				if (num >0 && num< 10){
					System.out.print("Seven");
					num = 0;
				}
				else if(num>20 && num<100){
					System.out.print("Seventy ");
				}
				else if(num>99 && num<1000){
					System.out.print("Seven hundred and ");
				}
				else if(num>999 && num < 10000){
					System.out.print("Seven thousand ");
				}
				break;
			case 8:
				if (num >0 && num< 10){
					System.out.print("Eight");
					num = 0;
				}
				else if(num>20 && num<100){
					System.out.print("Eighty ");
				}
				else if(num>99 && num<1000){
					System.out.print("Eight hundred and ");
				}
				else if(num>999 && num < 10000){
					System.out.print("Eight thousand ");
				}
				break;
			case 9:
				if (num >0 && num< 10){
					System.out.print("Nine");
					num = 0;
				}
				else if(num>20 && num<100){
					System.out.print("Ninety ");
				}
				else if(num>99 && num<1000){
					System.out.print("Nine hundred and ");
				}
				else if(num>999 && num < 10000){
					System.out.print("Nine thousand ");
				}
				break;
			case 10:
				System.out.print("Ten");
				num = 0;
				break;
			case 11:
				System.out.print("Eleven");
				num = 0;
				break;
			case 12:
				System.out.print("Twelve");
				num = 0;
				break;
			case 13:
				System.out.print("Thirteen");
				num = 0;
				break;
			case 14:
				System.out.print("Fourteen");
				num = 0;
				break;
			case 15:
				System.out.print("Fifteen");
				num = 0;
				break;
			case 16:
				System.out.print("Sixteen");
				num = 0;
				break;
			case 17:
				System.out.println("Seventeen");
				num = 0;
				break;
			case 18:
				System.out.print("Eighteen");
				num = 0;
				break;
			case 19:
				System.out.print("Ninteen");
				num = 0;
				break;
			case 20:
				System.out.print("Twenty");
				num = 0;
				break;
			default:
				break;
			}
			if (num > 999 && num<10000){
				num = num%1000;
			}
			else if(num >99 && num<10000){
				num = num%100;
			}
			else if(num > 20 && num < 100){
				num = num%10;
			}
			/*if (hun_check == 1 && thou_check==1){
				System.out.print("and ");
			}*/
			counter++;
		}
	}
}


