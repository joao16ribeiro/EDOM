/**
 */
package requirements.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import requirements.Comment;
import requirements.Priority;
import requirements.Requirement;
import requirements.RequirementsPackage;
import requirements.Resolution;
import requirements.State;
import requirements.Type;
import requirements.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link requirements.impl.RequirementImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getType <em>Type</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getId <em>Id</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getState <em>State</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getVersionRef <em>Version Ref</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getCommentRef <em>Comment Ref</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getReqRef <em>Req Ref</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getReq <em>Req</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementImpl extends MinimalEObjectImpl.Container implements Requirement {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Type TYPE_EDEFAULT = Type.FUNCTIONAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Priority PRIORITY_EDEFAULT = Priority.HIGH;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Priority priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected Date created = CREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final State STATE_EDEFAULT = State.NEW;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected State state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected static final Resolution RESOLUTION_EDEFAULT = Resolution.INVALID;

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected Resolution resolution = RESOLUTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVersionRef() <em>Version Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionRef()
	 * @generated
	 * @ordered
	 */
	protected Version versionRef;

	/**
	 * The cached value of the '{@link #getCommentRef() <em>Comment Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentRef()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> commentRef;

	/**
	 * The cached value of the '{@link #getReqRef() <em>Req Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqRef()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> reqRef;

	/**
	 * The cached value of the '{@link #getReq() <em>Req</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReq()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> req;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Priority getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(Priority newPriority) {
		Priority oldPriority = priority;
		priority = newPriority == null ? PRIORITY_EDEFAULT : newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(Date newCreated) {
		Date oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(State newState) {
		State oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resolution getResolution() {
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolution(Resolution newResolution) {
		Resolution oldResolution = resolution;
		resolution = newResolution == null ? RESOLUTION_EDEFAULT : newResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__RESOLUTION, oldResolution, resolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getVersionRef() {
		if (versionRef != null && versionRef.eIsProxy()) {
			InternalEObject oldVersionRef = (InternalEObject)versionRef;
			versionRef = (Version)eResolveProxy(oldVersionRef);
			if (versionRef != oldVersionRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequirementsPackage.REQUIREMENT__VERSION_REF, oldVersionRef, versionRef));
			}
		}
		return versionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version basicGetVersionRef() {
		return versionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionRef(Version newVersionRef) {
		Version oldVersionRef = versionRef;
		versionRef = newVersionRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__VERSION_REF, oldVersionRef, versionRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getCommentRef() {
		if (commentRef == null) {
			commentRef = new EObjectResolvingEList<Comment>(Comment.class, this, RequirementsPackage.REQUIREMENT__COMMENT_REF);
		}
		return commentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getReqRef() {
		if (reqRef == null) {
			reqRef = new EObjectResolvingEList<Requirement>(Requirement.class, this, RequirementsPackage.REQUIREMENT__REQ_REF);
		}
		return reqRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getReq() {
		if (req == null) {
			req = new EObjectResolvingEList<Requirement>(Requirement.class, this, RequirementsPackage.REQUIREMENT__REQ);
		}
		return req;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementsPackage.REQUIREMENT__TITLE:
				return getTitle();
			case RequirementsPackage.REQUIREMENT__DESCRIPTION:
				return getDescription();
			case RequirementsPackage.REQUIREMENT__TYPE:
				return getType();
			case RequirementsPackage.REQUIREMENT__PRIORITY:
				return getPriority();
			case RequirementsPackage.REQUIREMENT__AUTHOR:
				return getAuthor();
			case RequirementsPackage.REQUIREMENT__CREATED:
				return getCreated();
			case RequirementsPackage.REQUIREMENT__ID:
				return getId();
			case RequirementsPackage.REQUIREMENT__STATE:
				return getState();
			case RequirementsPackage.REQUIREMENT__RESOLUTION:
				return getResolution();
			case RequirementsPackage.REQUIREMENT__VERSION_REF:
				if (resolve) return getVersionRef();
				return basicGetVersionRef();
			case RequirementsPackage.REQUIREMENT__COMMENT_REF:
				return getCommentRef();
			case RequirementsPackage.REQUIREMENT__REQ_REF:
				return getReqRef();
			case RequirementsPackage.REQUIREMENT__REQ:
				return getReq();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RequirementsPackage.REQUIREMENT__TITLE:
				setTitle((String)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__TYPE:
				setType((Type)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__PRIORITY:
				setPriority((Priority)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__AUTHOR:
				setAuthor((String)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__CREATED:
				setCreated((Date)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__ID:
				setId((String)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__STATE:
				setState((State)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__RESOLUTION:
				setResolution((Resolution)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__VERSION_REF:
				setVersionRef((Version)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__COMMENT_REF:
				getCommentRef().clear();
				getCommentRef().addAll((Collection<? extends Comment>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__REQ_REF:
				getReqRef().clear();
				getReqRef().addAll((Collection<? extends Requirement>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__REQ:
				getReq().clear();
				getReq().addAll((Collection<? extends Requirement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RequirementsPackage.REQUIREMENT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__STATE:
				setState(STATE_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__RESOLUTION:
				setResolution(RESOLUTION_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__VERSION_REF:
				setVersionRef((Version)null);
				return;
			case RequirementsPackage.REQUIREMENT__COMMENT_REF:
				getCommentRef().clear();
				return;
			case RequirementsPackage.REQUIREMENT__REQ_REF:
				getReqRef().clear();
				return;
			case RequirementsPackage.REQUIREMENT__REQ:
				getReq().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RequirementsPackage.REQUIREMENT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case RequirementsPackage.REQUIREMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case RequirementsPackage.REQUIREMENT__TYPE:
				return type != TYPE_EDEFAULT;
			case RequirementsPackage.REQUIREMENT__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case RequirementsPackage.REQUIREMENT__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case RequirementsPackage.REQUIREMENT__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case RequirementsPackage.REQUIREMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case RequirementsPackage.REQUIREMENT__STATE:
				return state != STATE_EDEFAULT;
			case RequirementsPackage.REQUIREMENT__RESOLUTION:
				return resolution != RESOLUTION_EDEFAULT;
			case RequirementsPackage.REQUIREMENT__VERSION_REF:
				return versionRef != null;
			case RequirementsPackage.REQUIREMENT__COMMENT_REF:
				return commentRef != null && !commentRef.isEmpty();
			case RequirementsPackage.REQUIREMENT__REQ_REF:
				return reqRef != null && !reqRef.isEmpty();
			case RequirementsPackage.REQUIREMENT__REQ:
				return req != null && !req.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", type: ");
		result.append(type);
		result.append(", priority: ");
		result.append(priority);
		result.append(", author: ");
		result.append(author);
		result.append(", created: ");
		result.append(created);
		result.append(", id: ");
		result.append(id);
		result.append(", state: ");
		result.append(state);
		result.append(", resolution: ");
		result.append(resolution);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
