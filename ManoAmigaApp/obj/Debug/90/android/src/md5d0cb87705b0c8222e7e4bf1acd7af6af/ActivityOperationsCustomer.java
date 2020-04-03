package md5d0cb87705b0c8222e7e4bf1acd7af6af;


public class ActivityOperationsCustomer
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("ManoAmigaApp.ActivityOperationsCustomer, ManoAmigaApp", ActivityOperationsCustomer.class, __md_methods);
	}


	public ActivityOperationsCustomer ()
	{
		super ();
		if (getClass () == ActivityOperationsCustomer.class)
			mono.android.TypeManager.Activate ("ManoAmigaApp.ActivityOperationsCustomer, ManoAmigaApp", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
