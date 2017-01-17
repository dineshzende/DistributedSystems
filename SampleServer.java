/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
/* SampleServer.java */
import java.rmi.*;
public interface SampleServer extends Remote
{
  public int sum(int a,int b) throws RemoteException;
}

