package anonymousInnerClass;

class Friend {
	
	public void canManage(IManagableAICUsingMethodArgument managableAICUsingMethodArgument) {
		
		managableAICUsingMethodArgument.manage();
		
	}

}

public class FriendAICUsingMethodArgument {
	
	public static void main(String[] args) {
		
		Friend friend = new Friend();
		friend.canManage(new IManagableAICUsingMethodArgument() {
			
			@Override
			public void manage() {
				// TODO Auto-generated method stub
				System.out.println("Yes, I can Manage");
				
			}
		});
		
	}
	

}
