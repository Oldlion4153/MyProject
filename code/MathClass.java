/**
 * Math���O�`�Τ�k
 */

public class MathClass {
    public static void main(String[] args) {
    	System.out.println("�D�j�� 5.6 ���̤p��� : " + Math.ceil(5.6));
    	System.out.println("�D�p�� 5.6 ���̤j��� : " + Math.floor(5.6));
    	System.out.println("�D e �� 2 ���� : " + Math.exp(2));
		System.out.println("�D 2 ���۵M��ƭ� : " + Math.log(2));
		System.out.println("�D 5 �M 10 �G�̪����j�� : " + Math.max(5, 10));
		System.out.println("�D 5 �M 10 �G�̪����p�� : " + Math.min(5, 10));
		System.out.println("�D 2 �� 4����� : " + Math.pow(2,4));
		System.out.println("�D 6.5 ���|�B���J�� : " + Math.round(6.5));
		System.out.println("�D 16 ���}�ڸ��� : " + Math.sqrt(16));
		//���X�� 5 �Ӷü�
		System.out.println("���X�� 5 �Ӷü�");
		for(int i = 1; i < 5; i++)
			System.out.println(Math.random());	
    }
}
