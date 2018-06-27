/**
 * Spring's repackaging of
 * <a href="http://cglib.sourceforge.net">net.sf.cglib 3.2</a>
 * (for internal use only).
 *
 * <p>This repackaging technique avoids any potential conflicts with
 * dependencies on CGLIB at the application level or from third-party
 * libraries and frameworks.
 *
 * <p>As this repackaging happens at the class file level, sources
 * and javadocs are not available here. See the original
 * <a href="http://cglib.sourceforge.net/apidocs">CGLIB 3.2 javadocs</a>
 * for details when working with these classes.
 * 
 * 备注下： 该包和objenesis都是外部依赖过来的包，但是在编译时，改成了org.springframework目录下代码，为什么？
 */
package org.springframework.cglib;
